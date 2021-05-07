package edu.sjsu;

import edu.sjsu.messages.Message;
import edu.sjsu.view.CheckingsViewer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Tester {

    public static void main(String[] args) {
        BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
        //new AccountViewer(queue);
        new CheckingsViewer(queue);
        // Click "account name" to go to login page
        // Click "bank name" to go to home page
    }
}
