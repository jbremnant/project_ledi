:title: 0x02 Assemby Instructions
:id: 1400
:type: page
:parent_id: 1022


0x02 Assemby Instructions
=========================

You just got your LEDI as DIY kit. But what are all these parts? You might be
feeling overwhelmed with the thought of putting it all together? Don't worry!
It's a lot simpler than you might think.

|assembly2|


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
and brief description of each one. Each part is accompanied by clickable image to help
identify it easily.

====================  =========  ==================================================  ==============
Name                  Quantity   Description                                         Image
====================  =========  ==================================================  ==============
Atmega328p            1          the brain of LEDI, microcontroller with 28 pins     |pt_mcu|
28 pin DIP socket     1          socket for the microcontroller
HC-06/05 Bluetooth    1          bluetooth module for wireless communication         |pt_bt|
LDO Regulator         1          regulates 9VDC input into 5V or 3.3V                |pt_ldo|
Barrel jack           1          connector AC adaptor                                |pt_barrel|
Slide switch          2          on/off, 3.3/5v switch                               |pt_switch|
Tactile push button   4          buttons with 4 small legs                           |pt_button|
Capacitor 100uF       1          cylinder shape, aluminum, 2 leads
Capacitor 10uF        1          cylinder shape, aluminum, 2 leads
Zener diode 3.3v      1          small orange component with black stripe
Resistor 10k Ohms     1          strip colors:
Resistor 15 Ohms      1          strip colors:
Piezo Buzzer          1          makes sounds                                        |pt_buzz|
Header Single row     1          strip single row headers for breakout pins          |pt_header1|
Header Dual row       1          2 x 8 header for connecting ribbon cable            |pt_header2|
Spacer 1/8            4          1/8" length nylon spacers                           |pt_spacer2|
Spacer 1/4            4          2/8" length nylon spacers                           |pt_spacer1|
Spacer 3/4            4          6/8" length nylon spacers                           |pt_spacer3|
Screw 1-1/2"          4          1-1/2" stainless steel screw                        |pt_screw1|
Screw 5/8             4          5/8" stainless stell screw                          |pt_screw2|
====================  =========  ==================================================  ==============

The parts are easier to find once you organize them. It's good to label similar
looking parts beforehand, so you know exactly which part you are going to solder.
For example, here's how I organized the parts before soldering.

|parts1|


Take Note!
----------

Before assembly, you will need to take couple of things into account.
Understanding this section will ensure successful completion of your build.

There are few parts where the orientation of their placement is absolutely critical 
to correct operation of LEDI. Also, you will need to make sure you pick the resistors
with correct values. Now, let's go through each critical piece.

#. **Electrolytic Capacitor** (`wiki capacitor <http://en.wikipedia.org/wiki/Electrolytic_capacitor>`_)

   |pt_cap1| They look like aluminum cylinders wrapped in black plastic with one short and
   one long leg. *The short leg is the negative (-) terminal*! This negative terminal
   is also indicated on the plastic covering. The plastic cover will have a strip going
   down on the negative terminal side. The negative terminal connects to GROUND.

#. **Reverse Voltage Protection Diode** (`wiki diode <http://en.wikipedia.org/wiki/Diode>`_)

   |pt_diode| This part looks like a small black cynlinder. They allow current to flow in one
   direction and not in the other. A small white strip on one end indicates the blocking
   side. You will need to look at the PCB carefully and make sure the side with the 
   strip is properly aligned with the indicated strip on the PCB silkscreen.

#. **Zener Diode 3.3v** (`wiki zener diode <http://en.wikipedia.org/wiki/Zener_diode>`_)

   |pt_zdiode| This part also looks like a cylinder, but in orange. It is similar to the diode
   described above, but allows current to flow in the reverse direction when the
   voltage is above a certain value. The black strip on one end indicates the "blocking"
   side. You will need to carefully match this strip with the PCB silkscreen.

#. **Resistor**

   |pt_r15| You will need to be careful about getting the resistor values right.
   Refer to the following resistor color code to determine their value:

   |rescode|

   For example, if you see `red - yellow - black - yellow`, you can read

::

    red   yellow  black  orange
      2        4      0      1k   ==  240k
    black   blue  black  yellow
      0        6      0     10k   ==  60 * 10k = 600k


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

.. |assembly1| image:: /nas/docs/techversat/web/product_img/P1090133.JPG
   :uploaded: http://techversat.com/wp-content/uploads/P1090133.jpg
.. |assembly2| image:: /nas/docs/techversat/web/product_img/P1090137.JPG
   :uploaded: http://techversat.com/wp-content/uploads/P1090137.jpg
 
.. parts list
.. |pt_mcu| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_MCU.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_MCU-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_MCU.jpg
   :scale: 10
.. |pt_buzz| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Buzz.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Buzz-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Buzz.jpg
   :scale: 10
.. |pt_bt| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_BTModule.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_BTModule-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_BTModule.jpg
   :scale: 10
.. |pt_ldo| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_VRegulator.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_VRegulator-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_VRegulator.jpg
   :scale: 10
.. |pt_barrel| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_BarrelJack.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_BarrelJack-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_BarrelJack.jpg
   :scale: 10
.. |pt_switch| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_SlideSwitch.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_SlideSwitch-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_SlideSwitch.jpg
   :scale: 10
.. |pt_button| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_ButtonSwitch.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_ButtonSwitch-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_ButtonSwitch.jpg
   :scale: 10
.. |pt_header2| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_DualHeader.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_DualHeader-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_DualHeader.jpg
   :scale: 10
.. |pt_header1| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_SingleHeader.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_SingleHeader-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_SingleHeader.jpg
   :scale: 10
.. |pt_spacer1| image:: /nas/docs/techversat/web/product_img/edited/parts_lediAcrylic_Spacer-1-4.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Spacer-1-4-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Spacer-1-4.jpg
   :scale: 10
.. |pt_spacer2| image:: /nas/docs/techversat/web/product_img/edited/parts_lediAcrylic_Spacer-1-8.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Spacer-1-8-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Spacer-1-8.jpg
   :scale: 10
.. |pt_spacer3| image:: /nas/docs/techversat/web/product_img/edited/parts_lediAcrylic_Spacer-3-4.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Spacer-3-4-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Spacer-3-4.jpg
   :scale: 10
.. |pt_screw1| image:: /nas/docs/techversat/web/product_img/edited/parts_lediAcrylic_Screw-1.5.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Screw-1.5-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Screw-1.5.jpg
   :scale: 10
.. |pt_screw2| image:: /nas/docs/techversat/web/product_img/edited/parts_lediAcrylic_Screw-5-8.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Screw-5-8-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Screw-5-8.jpg
   :scale: 10
.. |pt_cap1| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Capacitor-100uF.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Capacitor-100uF-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Capacitor-100uF.jpg
   :scale: 10
.. |pt_diode| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_1N4001.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_1N4001-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_1N4001.jpg
   :scale: 10
.. |pt_zdiode| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Zener-3.3V.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Zener-3.3V-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Zener-3.3V.jpg
   :scale: 10
.. |pt_r15| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Resistor-15Ohm.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-15Ohm-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-15Ohm.jpg
   :scale: 10
