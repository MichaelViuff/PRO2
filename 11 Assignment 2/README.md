# 11 Assignment 2 - MVVM and Observer and Sockets

## The system:
You must design and implement a simple client/server application as the Vinyl lending library system, from Assignment 1, but with multiple clients.  

## The assignment: 
Implement the system and document it.

Use Wireshark to show what's happening under the hood.

## Requirements
 - The application must use Sockets connecting client and server, with the server being multithreaded 
 - The client must at least be able to:
   1. Get a list of all Vinyls
   2.	Reserve, borrow, and return a Vinyl
   3.	Receive messages broadcasted (multicasted) when a Vinyl changes lending state, and when a Vinyl has been removed (e.g. by the server)
 - All messages between client and server must be in JSON format, error messages from server included.
 - You must make a class diagram for the full solution (in Astah). In the diagram you must be able to identify the MVVM, the Observer pattern and the design of the socket related classes 
- You must use Java [Sockets](https://viaucdk-my.sharepoint.com/:p:/g/personal/mivi_viauc_dk/Ee3l0wPlAm5OmFJZwH65SBgBnjs-xIeNIXSELiK-TK52hA?e=c1aTSM) to connect the Client and Server
- You must use the [MVVM Design Pattern](https://viaucdk-my.sharepoint.com/:p:/g/personal/mivi_viauc_dk/ERq-HZanan1Il1qIAgibr28Bvv_fs64vBv-Q48cMdCEstA?rtime=EY6Qnpo23Eg) with at least two views, (maybe you already did this in Assignment 1. If not, you must do it now).
 - You must use the [Observer Design Pattern](https://viaucdk-my.sharepoint.com/:p:/g/personal/mivi_viauc_dk/EW35KX6HbzpOj9uJJOxxF00BQxuuh_EeSaFIzDn5nzYDNw?e=kHo1Xg) . 
- You must use the [Singleton (and/or Multiton) Design Pattern](https://viaucdk-my.sharepoint.com/:p:/g/personal/mivi_viauc_dk/EZHvva3YUOZMkN9iu-nGoNEBzYBtuVDubc87C9s4Tk5u5A?e=xiTOW8) as a log to the server console and to file(s). It should always be possible to find all the communication for an entire day –text, IP address, date and time.
- You must use the [Strategy Design Pattern](https://viaucdk-my.sharepoint.com/:p:/g/personal/mivi_viauc_dk/EZHvva3YUOZMkN9iu-nGoNEBzYBtuVDubc87C9s4Tk5u5A?e=xiTOW8)
- You must create a UML Class Diagram for the final solution (preferably in Astah).

## Hints
Like in the previous assignment, the purpose is not to have a functionally impressive system.

Focus on the patterns, and the concepts being taught, to create clean code.

Including all design patterns may be difficult, but try your best.

## Format
You are allowed to work together, but you must hand in individually. 

Hand in everything in a single zip-file with:

 - UML Class Diagram 
 - Source code for all classes
 - Related resources like `.FXML` files, and if used, external `.jar` files
 - Documentation of your protocol (messages, syntax and actions).
 - Annotated printout from Wireshark that show the following information:
   - The segments exchanged in the 3-way handshake. How are they identified?
   - IP addresses and port numbers associated with the TCP socket established between your client and server. The client and server should preferably run on different hosts.
   - Application layer “borrow” request message from client and response message from server.



## Deadline
See Itslearning.

## Evaluation
Your hand-in will be used during the exam, but will not be evaluated separately.

Feedback available upon request.
