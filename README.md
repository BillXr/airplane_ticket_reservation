# Airplane-ticket-reservation

Java project with java swing for airplane tickets reservation.

This program gives client through a gui to choose the option he wants.He can make a new ticket reservation with his informations and add it to a list using the new button,which will be saved in a file locally in our system.

Also he can watch the list of tickets in a new frame with list button that has already been booked and check for informations.In this frame there are 3 new buttons for new reservation,refresh of the list and exit.In this frame he can see the total booked tickets,the total amount spended for them,also the tickets with highest and lowest price.

Furthermore with the about button or about item from menu he can see details about the developer of the app.He can exit the app through the X button on the upper right corner.




<p align="center">
  <img src=/images/menu.PNG  width="400" height="300"/>
</p>
<!--
+ Insert values
<
<p align="center">
  <img src=/images/java4.PNG  width="500" height="300" />
</p>

 + Save locally
<!--
<p>
  <img src=/images/choose_file.PNG width="400" height="350" />
  <img src=/images/save_changes.PNG width="400" height="350" />
</p>


Also he can watch the list of tickets in a new frame with list button that has already been booked and check for informations.In this frame there are 3 new buttons for new reservation,refresh of the list and exit.In this frame he can see the total booked tickets,the total amount spended for them,also the tickets with highest and lowest price.

+ Ticket List

<p align="center">
  <img src=/images/ticket_list.PNG  width="500" height="400" />
</p>

Furthermore with the about button or about item from menu he can see details about the developer of the app.

+ Info

<p align="center">
  <img src=/images/info.PNG  width="300" height="300" />
</p>

He can exit the app through the X button on the upper right corner.

+ Exit app

<p align="center">
  <img src=/images/exit_app.PNG  width="300" height="250" />
</p>
--->

For the above actions he can use the buttons that are placed on the frame or he can access them from the menu item that has been created on the upper left corner.

### Requirements

Execute program using Docker containers.

With dockerfile included in project run:

    docker build -t airticket-app

    docker run -d -p 8080:8080 airticket-app

If you don't want to use Docker just clone repository and run it locally.
    
You should have a jdk installed on your machine.

You can download java from <a href="https://www.oracle.com/java/technologies/downloads/" target="_blank"> here.</a>

Install java and check version `java --version`

```
C:\Users\bill>java --version
java 11.0.10 2021-01-19 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.10+8-LTS-162)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.10+8-LTS-162, mixed mode)
```

For the creation of this project i used java (JDK 11) and Eclipse IDE on windows 10 environment.
