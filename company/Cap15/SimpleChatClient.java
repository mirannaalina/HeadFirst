package com.company.Cap15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClient {
    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

    public static void main (String[]args){
        SimpleChatClient client =new SimpleChatClient();
        client.go();
    }

    public void go() {
        JFrame frame = new JFrame("Ludicrouly Simple chat client hi hi");
        JPanel mainPanel = new JPanel();
        incoming = new JTextArea(15, 50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(qScroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        setUpNetworking();

        Thread readerThread = new Thread(new IncomingReader());//facem un thread ca sa citeasca de la server
        readerThread.start();                     //daca sunt mesaje de afisat in scrolling area

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }

    private void setUpNetworking() {
        try {
            sock = new Socket ("127.0.0.1", 5000);
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");

        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent ev){
            try {
                writer.println(outgoing.getText());
                writer.flush();
            }catch(Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }



    }
    //asta face threads , in metoda run() sta in loop atat timp cat ce primeste de la server nu e NULL
    //citind cate o linie si adauga fiecarei linii un mesaj pe care il dau eu ,alaturi de new line char\n

    public class IncomingReader implements Runnable{
        public void run() {
            String message;
            try {
                while ((message =reader.readLine()) != null) {
                    System.out.println("read " +message);
                    incoming.append(message+ " \n");
                }
            }catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}










