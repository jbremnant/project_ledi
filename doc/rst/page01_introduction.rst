:id: 1394
:title: 0x01 Introduction to LEDI
:type: page
:parent_id: 1022


0x01 Introduction to LEDI
=========================

LEDI, short for LED Interface, is your own personal display device that you can
build, control, and modify. It can receive messages from bluetooth 
devices or from host PC and display it to the LED matrix board.

LEDI was designed to be simple, fun to build, and customizable by DIYers and
non-DIYers alike. We wanted the kit to not only be useful, but a good introduction
for people to take interest in the Do-It-Yourself electronics scene.
We also love open source, and for that reason, all aspects of this kit is open source.

|ledi_studio_photo|

LEDI is immediately hackable, and you will find that it's possible to extend its
usage to countless electronic projects. Its features are:

* 32 x 8 LED matrix, comes in green or red
* Uses the versatile Atmega328p, the same microcontroller that powers the popular Arduino
* Bluetooth enabled! It can pair with your Android phone and even with your PC
* Through-hole components for easy construction
* Downloadable Android app that can communicate with the clock
* Customizable firmware, total hack-ability
* You can design your own custom enclosures! Check out our homemade cases

We are excited to see how the community will utilize this kit.


Features
========



How It All Started
==================

This project simply started out of my wife.s rather nonchalant question::

  can you do something useful with your electronics hobby?

I made `this clock <http://hackaday.com/2010/09/22/matrix-clock-is-a-breadboarding-win/>`_
mostly to impress my wife and justify my purchases of electronic parts and devkits,
lots of devkits... After our son turned one, I wanted to teach him alphabets. So the clock
went on to becoming a `bluetooth enabled display <http://jbremnant.wordpress.com/2011/12/09/led-display-over-bluetooth-with-android/>`_.
I would send alphabets to the clock from my Android phone, and attempt to 
grab a toddler's attention on reading the scrolling letters. Good luck to that, right?


And then my wife thought it would be great to have this on my desk at work. 
Why? So that she can grab my attention by sending messages to it remotely. Yikes! 
At first I didn't like the idea of my wife creating uncomfortable situations at 
work, but... I caved in. And that was the birth of LEDI.  :-)


* LED clock originally created without bluetooth:

  http://jbremnant.wordpress.com/2010/11/18/my-first-complete-avr-project/

* And then upgraded with HC-06 bluetooth module, which enables sending text message
  and time update via bluetooth from Android phone or from PC.

  http://jbremnant.wordpress.com/2011/12/09/led-display-over-bluetooth-with-android/

* Now a proper product with its own PCB and enhanced firmware, called LEDI.

  http://techversat.com


.. |ledi_studio_photo| image:: /nas/docs/techversat/web/product_img/DSC_0085.JPG
   :uploaded-scale20: http://techversat.com/wp-content/uploads/DSC_0085-scale20.jpg
   :uploaded: http://techversat.com/wp-content/uploads/DSC_0085.jpg
   :scale: 20
.. :align: left


