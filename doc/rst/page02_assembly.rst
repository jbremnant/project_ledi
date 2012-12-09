:title: 0x02 Assembly Instructions
:id: 1400
:type: page
:parent_id: 1022


0x02 Assembly Instructions
==========================

You just got your LEDI as DIY kit. But what are all these parts? Perhaps you 
are overwhelmed with the thought of putting it all together? Don't worry!
It's a lot simpler than you might think.

|assembly-indexed|

You should see the following items in your LEDI DIY kit package:

* **A1**: 32x8 LED matrix
* **A2**: Connector between LED matrix and PCB
* **B** : LEDI PCB
* **C1**: Dedicated parts on foam
* **C2**: A bag of small components
* **C3**: Bluetooth module
* **D** : AC to 9V DC wall adaptor

Preparation
-----------

Assembling LEDI is straight-forward and fun. We will guide you through each
step. First, you will need to have the following tools ready:

====================================  ====================
Tool                                  Looks Like
====================================  ====================
1. soldering_ iron                     |soldering_iron|
2. solder_ (Lead free preferable)      |solder|
3. flux_ (good to have)               |flux_pen|
4. digital multimeter_ (optional)      |multimeter|
====================================  ====================

.. _flux: https://www.sparkfun.com/products/8967
.. _solder: https://www.sparkfun.com/products/9325
.. _soldering: http://www.adafruit.com/category/8_84
.. _multimeter: https://www.sparkfun.com/products/9141


Lastly, some patience.  :-)

Here are the steps we will take

#. Organize the parts
#. Solder
#. Download the Android app on your phone
#. Play with it!

Let's go through the detailed steps below. We suggest you set aside about
1.5 hours to build the kit. We will tackle one section at a time. Before
you know it, you will get things rolling very soon.

If you've never soldered before, it might be good to do some prep reading.
There are lots of great videos and tutorials online. Here are few:

* `Sparkfun tutorial <http://www.sparkfun.com/tutorials/106>`_.
* `Adafruit tutorial <http://www.ladyada.net/learn/soldering/thm.html>`_.
* `this one <http://www.aaroncake.net/electronics/solder.htm>`_ 


Laying It All Out
-----------------

There are total of 30 parts in LEDI. Here's a complete list of all the parts
and brief description of each one. Each part is accompanied by clickable image to help
identify it easily.

====================  =========  ==================================================  ==============
Name                  Quantity   Description                                         Image
====================  =========  ==================================================  ==============
Atmega328p            1          the brain of LEDI, microcontroller with 28 pins     |pt_mcu|
28 pin DIP socket     1          socket for the microcontroller
LEDI PCB              1          PCB (red/green)                                     |pt_pcb|
HC-06/05 Bluetooth    1          bluetooth module for wireless communication         |pt_bt|
LDO Regulator         1          regulates 9VDC input into 5V or 3.3V                |pt_ldo|
PTC resetable fuse    1          orange ceremic fuse .25A                            |pt_ptc|
Crystal               1          32.768KHz, silver cylinder shape                    |pt_crystal|
Barrel jack           1          connector for AC adaptor                            |pt_barrel|
Slide switch          2          on/off, 3.3/5v switch                               |pt_switch|
Tactile push button   4          buttons with 4 small legs                           |pt_button|
Capacitor 100uF       1          cylinder shape, aluminum, 2 leads                   |pt_cap100|
Capacitor 10uF        1          cylinder shape, aluminum, 2 leads                   |pt_cap10|
Capacitor 0.1uF       2          blue ceramic capacitor                              |pt_cap01|
Zener diode 3.3v      1          small orange component with black stripe            |pt_zener|
Rectifier 1N4001      1          to protect the power circuit                        |pt_1N4001|
Resistor 16k Ohms     1          ^strip colors: brown,blue,black,red                 |pt_res16k|
Resistor 10k Ohms     3          ^strip colors: brown,black,black,red                |pt_res10k|
Resistor 390 Ohms     1          ^strip colors: orange,white,brown                   |pt_res390|
Resistor 330 Ohms     2          ^strip colors: orange,orange,black,black            |pt_res330|
Resistor 300 Ohms     1          ^strip colors: orange,black,brown                   |pt_res300|
Resistor 240 Ohms     1          ^strip colors: red,yellow,brown                     |pt_res240|
Resistor 15  Ohms     1          ^strip colors: brown,green,black,gold               |pt_res15|
LED Red               1          red LED                                             |pt_ledRed|
LED Amber             1          oval shape amber LED                                |pt_ledAmber|
Piezo Buzzer          1          makes sounds                                        |pt_buzz|
Header Single row     1          12 pins single row headers for breakout pins        |pt_header1|
Header Dual row       1          2 x 15 header for connecting ribbon cable           |pt_header2|
AC-9V DC adaptor      1          AC to 9V DC wall adaptor                            |pt_adaptor|
LED matrix            1          32x8 LED matrix                                     |pt_ledmtx|
Serial connector      1          Connector for LED matrix and PCB                    |pt_conn|
====================  =========  ==================================================  ==============

Resistors may come in different color and number of stripes depending on manufacturer,
the strip color specified above only indicates the resistor value portion.
Please refer to the Resistor_ section for detail.

**If you are purchasing the acrylic enclosure**, the package should also include:

======================  =========  ==================================================  ==============
Name                    Quantity   Description                                         Image
======================  =========  ==================================================  ==============
Spacer 1/8"             4          1/8" length nylon spacers                           |pt_spacer2|
Spacer 1/4"             4          2/8" length nylon spacers                           |pt_spacer1|
Spacer 3/4"             4          6/8" length nylon spacers                           |pt_spacer3|
Screw 1-1/2"            4          1-1/2" stainless steel screw                        |pt_screw1|
Screw 5/8               4          5/8" stainless steel screw                          |pt_screw2|
Nuts 4-40 thread        8          4-40 thread stainless steel hex nuts                |pt_nuts|
Acrylic front plate     1          Transparent acrylic plate for front cover           |pt_front|
Acrylic adaptor plate   2          Transparent acrylic adaptor                         |pt_Aadaptor|
======================  =========  ==================================================  ==============



Take Note!
----------

Before assembly, you will need to take couple of things into account.
Understanding this section will ensure successful completion of your build.

There are few parts where the orientation of their placement is absolutely critical 
to correct operation of LEDI. Also, you will need to make sure you pick the resistors
with correct values. Now, let's go through each critical piece.

#. **Electrolytic Capacitor** (`wiki capacitor <http://en.wikipedia.org/wiki/Electrolytic_capacitor>`_)

   |pt_cap1| They look like aluminum cylinders wrapped in black plastic with one short and
   one long leg. **The short leg is the negative (-) terminal**! This negative terminal
   is also indicated on the plastic covering. The plastic cover will have a strip going
   down on the negative terminal side. The negative terminal connects to GROUND.

#. **Reverse Voltage Protection Diode** (`wiki diode <http://en.wikipedia.org/wiki/Diode>`_)

   |pt_diode| This part looks like a small black cynlinder. They allow current to flow in one
   direction and not in the other. A small white strip on one end indicates the blocking
   side. You will need to look at the PCB carefully and make sure the side with the 
   strip is properly aligned with the indicated strip on the PCB silkscreen (white labels on PCB).

#. **Zener Diode 3.3v** (`wiki zener diode <http://en.wikipedia.org/wiki/Zener_diode>`_)

   |pt_zdiode| This part also looks like a cylinder, but in orange. It is similar to the diode
   described above, but allows current to flow in the reverse direction when the
   voltage is above a certain value. The black strip on one end indicates the "blocking"
   side. You will need to carefully match this strip with the PCB silkscreen.

#. **LED** (`light-emitting diode <http://en.wikipedia.org/wiki/LED>`_)

   |pt_ledRed| One of the most common parts you can find in electronic kits or even at your
   local RadioShack, this part also has two legs - one short, one long. The short leg is the
   (-) terminal. Make sure the shorter leg connects to GROUND.

.. _Resistor:

#. **Resistor**

   |pt_r15| You will need to be careful about getting the resistor values right.
   Refer to the following resistor color code to determine their value:

   |rescode|

   For example, if you see `red - yellow - black - orange`, you can read

::

    red   yellow  black  orange
      2        4      0      1k   ==  240k

Sometimes, the color bands are hard to distinguish on the resistor.  It's good to have a multimeter
which can measure the resistance.


Soldering the Parts
-------------------

Through-hole soldering is pretty fun! Make sure you work in a well ventilated room.
Now, all you need is some solder and a soldering iron. 

The parts are easier to find once you organize them. It's good to label similar
looking parts beforehand, so you know exactly which part you are going to solder.
For example, here's how I organized the parts before soldering.

|parts1|

It's good to complete similar parts of the circuit and then move onto the next. 
This way, you can make sure you got all the parts soldered in the right place,
instead of jumping around the circuit. (not literally!)

LEDI circuit can be roughly divided into 4 sections. We will complete each section
at a time before moving onto the next. 

|tut_overview1|

You will soon see that soldering LEDI board is easy and straight-forward.

 
Power supply circuit
~~~~~~~~~~~~~~~~~~~~
You will need to be careful about the polarity of the electrolyte capacitors.
The shorter leg is the negative side. It's this shorter leg that will connect
to ground. The same goes for the power indicator LED. The shorter leg connects
to the ground through-hole, which is denoted with a minus "-" sign.

|tut_pwr1|

Here's how I placed the parts before soldering. Notice the legs are bent on the
other side of the PCB so that they are held stationary as I solder them permanently
in place.

|tut_pwr2|


Bluetooth module
~~~~~~~~~~~~~~~~
The bluetooth module is the hardest part to solder. You will find that the rest of
what follows is a breeze. First place the bluetooth module on the PCB.
You will solder just one pad on each side first. This will hold the module in place.

You will only need to solder 11 joints on the module. The rest of the pads does not need 
to be soldered. Those 11 joints are indicated by orange circle below:

|tut_bt2|

If you have the flux handy, it helps the solder to flow onto the pads easily.
You can use it to "tin" the pads by

#. applying little bit of flux onto the PCB pads
#. put some solder on the soldering iron, and gently pass it over the pads

At this point, the solder will flow to the pads and settle. Once the pads are tinned
with solder, you can simply set the bluetooth module on top, and touch the pad to
reflow the solder onto the bluetooth connection grooves.

Once the bluetooth module is soldered, solder the indicator LED and resistors 
around the bluetooth module. The headers are optional, unless you plan to hack around
with LEDI later on.


Zener diode voltage regulator circuit 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
It's crucial to get the resistor value right here. You will need 15 Ohm (not 15k!!!)
resistor, a zener diode, and a 0.1uF capacitor. As a reminder, resistor strip colors are::
     
      1     5    0x  tolerance  ==  15 ohm
  brown green black  gold

The zener diode need special attention as well. Make sure you align the black strip
side with the side that has white line on the PCB. It should look like the following picture.

|tut_zener1|

You can then add the push button that will allow you to reset the bluetooth module.
Optionally, you can add the headers that will give you access to the bluetooth module's UART ports.

After this circuit is built, you are ready to do your first test! Simply plug in the 9V
power adaptor to the wall, and connect the barrel jack to the board. Take a deep breath
and turn the switch to "on" position!

Do you see the power LED light up and the indicator LED near the bluetooth module
blinking? If so, you are on your way to getting it successfully built!
If not, you will need to check your components and make sure you soldered the
parts correctly.
 

Atmega328p microcontroller and headers
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
This is the easiest part of the circuit. You have one pull up resistor (10k ohm), 3 buttons,
watch crystal (32.768kHz) and IC socket. The microcontroller will be inserted into the IC
socket once everything is soldered in place.

The 2x3 header on the bottom right corner is a must if you plan on flashing the firmware.
By default, LEDI will come preloaded with the most recent firmware. However, if you plan
on doing firmware development and modify functionality, solder the 2x3 header there.

Also, the 1x8 header gives you access to unused I/O pins on the microcontroller. Solder this
too if you want to make LEDI interface with other electronics.




Testing the Circuit
-------------------

Now you are finally ready to test the whole thing!
Let's first connect the LED matrix to the circuit board.

Note that the ribbon cable has a red strip on one end. The red strip denotes the first pin.
Align this with the pin labelled CS1 on the circuit board.
The PCB side of the ribbon cable connection looks like this:

|tut_conn1|

Don't mind the other device on the picture right now (`little wire <http://littlewire.cc/>`_) -
this device can help flash the firmware of LEDI.

Connect the other side of the ribbon cable to the LED matrix. Make sure your DIP switch on the
LED matrix board looks like this:

.. leesa, picture of the 1,2,3,4 switch on the backside of LED board


Once connected, time to power it on!
Connect the included 9VDC adaptor to the barrel jack, and plug it to the wall outlet.
Now, take a deep breath again and switch the power to **on**.
Did you see the sign "LEDI" on the LED matrix board? If so, congratulations!
You have successfully assembled LEDI.

There's so much more to play around with. Check out our other tutorials to explore many
exciting projects with LEDI.



.. |tut_overview1| image:: /nas/docs/techversat/web/product_img/tut_overview1.jpg
   :uploaded: http://techversat.com/wp-content/uploads/tut_overview1.jpg
.. |tut_pwr1| image:: /nas/docs/techversat/web/product_img/tut_pwr1.JPG
   :uploaded: http://techversat.com/wp-content/uploads/tut_pwr1.jpg
.. |tut_pwr2| image:: /nas/docs/techversat/web/product_img/tut_pwr2.JPG
   :uploaded: http://techversat.com/wp-content/uploads/tut_pwr2.jpg
.. |tut_bt1| image:: /nas/docs/techversat/web/product_img/tut_bt1.JPG
   :uploaded: http://techversat.com/wp-content/uploads/tut_bt1.jpg
.. |tut_bt2| image:: /nas/docs/techversat/web/product_img/tut_bt2.jpg
   :uploaded: http://techversat.com/wp-content/uploads/tut_bt2.jpg
.. |tut_zener1| image:: /nas/docs/techversat/web/product_img/tut_zener1.JPG
   :uploaded: http://techversat.com/wp-content/uploads/tut_zener11.jpg
.. |tut_conn1| image:: /nas/docs/techversat/web/product_img/tut_conn1.jpg
   :uploaded: http://techversat.com/wp-content/uploads/tut_conn1.jpg

.. |pcb1| image:: http://techversat.com/wp-content/uploads/2012/09/tut_pcb_close.jpg
   :uploaded: http://techversat.com/wp-content/uploads/tut_pcb_close.jpg
.. |parts1| image:: http://techversat.com/wp-content/uploads/2012/09/parts_ledi_SmallComponents.JPG
   :uploaded: http://techversat.com/wp-content/uploads/2012/09/parts_ledi_SmallComponents.JPG
.. |rescode| image:: http://techversat.com/wp-content/uploads/2012/09/resistor_code1.gif
   :uploaded: http://techversat.com/wp-content/uploads/resistor_code1.gif

.. |assembly1| image:: /nas/docs/techversat/web/product_img/P1090133.JPG
   :uploaded: http://techversat.com/wp-content/uploads/P1090133.jpg
.. |assembly2| image:: /nas/docs/techversat/web/product_img/P1090137.JPG
   :uploaded: http://techversat.com/wp-content/uploads/P1090137.jpg
.. |assembly-indexed| image:: http://techversat.com/wp-content/uploads/2012/09/parts_ledi_All-indexed.JPG
   :uploaded: http://techversat.com/wp-content/uploads/2012/09/parts_ledi_All-indexed.JPG

.. |soldering_iron| image:: http://www.mouser.com/images/cooperind/images/wtcpt_300.jpg
   :uploaded: http://techversat.com/wp-content/uploads/wtcpt_300.jpg
.. |solder| image:: http://www.adafruit.com/images/medium/ID734_MED.jpg
   :uploaded: http://techversat.com/wp-content/uploads/ID734_MED.jpg
.. |flux_pen| image:: https://dlnmh9ip6v2uc.cloudfront.net/images/products/8/9/6/7/08967-03-L_i_ma.jpg
   :uploaded: http://techversat.com/wp-content/uploads/08967-03-L_i_ma.jpg
.. |multimeter| image:: https://dlnmh9ip6v2uc.cloudfront.net/images/products/9/1/4/1/09141-01B-Working_i_ma.jpg
   :uploaded: http://techversat.com/wp-content/uploads/09141-01B-Working_i_ma.jpg
 
.. parts list
.. |pt_mcu| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_MCU.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_MCU-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_MCU.jpg
   :scale: 10
.. |pt_pcb| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_PCB-v1.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_PCB-v1-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_PCB-v1.jpg
   :scale: 10
.. |pt_bt| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_BTModule.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_BTModule-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_BTModule.jpg
   :scale: 10
.. |pt_ldo| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_VRegulator.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_VRegulator-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_VRegulator.jpg
   :scale: 10
.. |pt_ptc| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_PTC.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_PTC-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_PTC.jpg
   :scale: 10
.. |pt_crystal| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Crystal.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Crystal-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Crystal.jpg
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
.. |pt_cap100| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Capacitor-100uF.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Capacitor-100uF-scale101.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Capacitor-100uF1.jpg
   :scale: 10
.. |pt_cap10| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Capacitor-10uF.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Capacitor-10uF-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Capacitor-10uF.jpg
   :scale: 10
.. |pt_cap01| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Capacitor-0.1uF.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Capacitor-0.1uF-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Capacitor-0.1uF.jpg
   :scale: 10
.. |pt_zener| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Zener-3.3V.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Zener-3.3V-scale101.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Zener-3.3V1.jpg
   :scale: 10
.. |pt_1N4001| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_1N4001.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_1N4001-scale101.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_1N40011.jpg
   :scale: 10
.. |pt_res16k| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Resistor-16KOhm.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-16KOhm-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-16KOhm.jpg
   :scale: 10
.. |pt_res10k| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Resistor-10KOhm.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-10KOhm-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-10KOhm.jpg
   :scale: 10
.. |pt_res390| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Resistor-390Ohm.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-390Ohm-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-390Ohm.jpg
   :scale: 10
.. |pt_res330| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Resistor-330Ohm.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-330Ohm-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-330Ohm.jpg
   :scale: 10
.. |pt_res300| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Resistor-300Ohm.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-300Ohm-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-300Ohm.jpg
   :scale: 10
.. |pt_res240| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Resistor-240Ohm.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-240Ohm-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-240Ohm.jpg
   :scale: 10
.. |pt_res15| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Resistor-15Ohm.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-15Ohm-scale101.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Resistor-15Ohm1.jpg
   :scale: 10
.. |pt_ledAmber| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_LED-Yellow.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_LED-Yellow-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_LED-Yellow.jpg
   :scale: 10
.. |pt_ledRed| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_LED-Red.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_LED-Red-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_LED-Red.jpg
   :scale: 10
.. |pt_buzz| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Buzz.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Buzz-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Buzz.jpg
   :scale: 10
.. |pt_adaptor| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_WallAdaptor-AC-9VDC.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_WallAdaptor-AC-9VDC-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_WallAdaptor-AC-9VDC.jpg
   :scale: 10
.. |pt_header1| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_SingleHeader.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_SingleHeader-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_SingleHeader.jpg
   :scale: 10
.. |pt_header2| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_DualHeader.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_DualHeader-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_DualHeader.jpg
   :scale: 10
.. |pt_ledmtx| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_LEDMatrix-32x8.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_LEDMatrix-32x8-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_LEDMatrix-32x8.jpg
   :scale: 10
.. |pt_conn| image:: /nas/docs/techversat/web/product_img/edited/parts_ledi_Connector-LEDMatrix-PCB.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_ledi_Connector-LEDMatrix-PCB-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_ledi_Connector-LEDMatrix-PCB.jpg
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
.. |pt_nuts| image:: /nas/docs/techversat/web/product_img/edited/parts_lediAcrylic_Nut-4-40.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Nut-4-40-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Nut-4-40.jpg
   :scale: 10
.. |pt_front| image:: /nas/docs/techversat/web/product_img/edited/parts_lediAcrylic_FrontCover.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_lediAcrylic_FrontCover-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_lediAcrylic_FrontCover.jpg
   :scale: 10
.. |pt_Aadaptor| image:: /nas/docs/techversat/web/product_img/edited/parts_lediAcrylic_Adaptor.JPG
   :uploaded-scale10: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Adaptor-scale10.jpg
   :uploaded: http://techversat.com/wp-content/uploads/parts_lediAcrylic_Adaptor.jpg
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
