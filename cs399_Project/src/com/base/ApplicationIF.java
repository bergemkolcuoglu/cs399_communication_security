package com.base;

import java.net.Socket;
import java.util.ArrayList;

/**
 * Defines callbacks from the StackCore. An application using StackCore
 * is needed to implement this interface
 * 
 * @author demiry
 *
 */
public interface ApplicationIF {
   /* From TCP */
   public int onReceivedMessage(byte[] rawMessage, int length, Socket socket);
   
   /* From UDP */
   public int onReceivedMessage(byte[] rawMessage, int length, String sourceAddress, short sourcePort);
   
   /* Note that parameter 'message' consists of only headers part of message */
   public int onReceivedMessage(String message, ArrayList<String> messageHeader, byte[] messageBody);
   
   public int onResponseTimeout();
   
   public int onSendMessage();
   
   public int onConnectionSuccess(String locAddr, int locPort, String remAddr, int remPort);
   
   public int onConnectionFail(String remAddr, int remPort);
   
   public int onDisconnect(int failReason);
}
