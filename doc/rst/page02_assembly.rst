:title: 0x02 Assemby Instructions
:id: 1400
:type: page
:parent_id: 1022


0x02 Assemby Instructions
=========================

You just got your LEDI as DIY kit. But what are all these parts? You might be
feeling overwhelmed with the thought of putting it all together? Don't worry!
It's a lot simpler than you might think.

|pcb1|

Preparation
-----------

Assembling LEDI is straight-forward and fun. We will guide you through each
step. First, you will need to have the following tools ready:

* soldering iron
* solder (Lead free preferable)
* flux
* digital multimeter
* some patience  :-)

Here are the steps we will take

#. Organize the parts
#. Solder
#. Download the Android app on your phone
#. Play with it!

Let's go through the detailed steps below. We suggest you set aside about
1.5 hours to build the kit. We will tackle one section at a time. Before
you know it, you will get things rolling very soon.


Laying It All Out
-----------------

There are a total of 35 parts in LEDI. Here's a complete list of all the parts
and brief description of each one.

====================  =========  =================================================
Name                  Quantity   Description
====================  =========  =================================================
Atmega328p            1          the brain of LEDI, microcontroller with 28 pins
28 pin DIP socket     1          socket for the microcontroller
HC-06/05 Bluetooth    1          bluetooth module for wireless communication
Barrel jack           1          connector AC adaptor
Slide switch          2          on/off, 3.3/5v switch
Tactile push button   4          buttons with 4 small legs
Capacitor 100uF       1          cylinder shape, aluminum, 2 leads
Capacitor 10uF        1          cylinder shape, aluminum, 2 leads
Resistor 10k Ohms     1          strip colors:
Zener diode 3.3v      1          small orange component with black stripe
Resistor 15 Ohms      1          strip colors:
====================  =========  =================================================

The parts are easier to find once you organize them. And there's a pattern!
Here's how I organized mine before building it.

|parts1|

The only thing you will need to be careful about, is to get the resistor values
right. Refer to the following resistor color code to determine their value:

|rescode|



Soldering the Parts
-------------------

Through-hole soldering is pretty fun! Make sure you work in a well ventilated room.
Now, all you need is some solder and a soldering iron. I work in sections.
It's good to complete similar parts of the circuit and then move onto the next. 
This way, you can make sure you got all the parts soldered in the right place,
instead of jumping around the circuit. (not literally!)


Bluetooth module
~~~~~~~~~~~~~~~~
Let's tackle the hardest part first. And you will find that the rest of what follows
is a breeze. First place the bluetooth module on the PCB. You will solder just one
pad on each side first. This will hold the module in place. You will only need to
solder 8 joints on the module. The rest of the pads can be left as is.

It's helpful to have flux handy. The flux helps the solder to flow onto the pads easily.
If you happen to have it, you can "tin" the pads by

  #. apply little bit of flux onto the pads
  #. put some solder on the soldering iron, and pass it over the pads.

At this point, the solder will flow to the pads and settle. Once the pads are tinned
with solder, you can simply set the bluetooth module on top, and touch the pad to
reflow the solder onto the bluetooth connection grooves.

 
Power supply circuit
~~~~~~~~~~~~~~~~~~~~
 
You will need to be careful about the polarity of the electrolyte capacitors.
The shorter leg is the negative side. It's this shorter leg that will connect
to ground. The same goes for the power indicator LED. The shorter leg connects
to the ground through-hole, which is denoted with a minus "-" sign.

Here's how I setup my parts before soldering. Notice the legs are bent so that
they are held stationary as I solder them permanently in place.
 

Zener diode voltage regulator circuit 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
It's crucial to get the resistor value right here. You will need 15 Ohm (not 15k!!!)
resistor, a zener diode, and a 0.1uF capacitor. Place the parts like so:


And then solder them in place. You can then add the push button that will allow you
to reset the bluetooth module. Optionally, you can add the headers that will give you
access to the bluetooth module.s UART ports.

After this circuit is built, you are ready to do your first test! Simply plug in the 9V
power adaptor to the wall, and connect the barrel jack to the board. Take a deep breath
and turn the switch to "on" position!

Do you see the power LED light up and the indicator LED near the bluetooth module
blinking? If so, you are on your way to getting it successfully built!
If not, you will need to check your components and make sure you soldered the
parts correctly.
 

Atmega328p microcontroller and headers
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

This is the easiest part of the circuit. You have 4 resistors, 3 buttons, and IC socket.
Solder them just like you did with other previous parts.
 


Testing the Circuit
-------------------

Connect the LED matrix to the circuit board. The ribbon cable has a red strip on one end.
The red strip denotes the first pin. Align this with the pin labelled CS1 on the circuit
board.





.. |pcb1| image:: http://techversat.com/wp-content/uploads/2012/09/tut_pcb_close.jpg
   :uploaded: http://techversat.com/wp-content/uploads/tut_pcb_close.jpg
.. |parts1| image:: http://techversat.com/wp-content/uploads/2012/09/tut_parts011.jpg
   :uploaded: http://techversat.com/wp-content/uploads/tut_parts011.jpg
.. |rescode| image:: http://techversat.com/wp-content/uploads/2012/09/resistor_code1.gif
   :uploaded: http://techversat.com/wp-content/uploads/resistor_code1.gif
