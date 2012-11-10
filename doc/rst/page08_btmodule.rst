Working With Bluetooth Module
=============================

This document describes the bluetooth module included with LEDI.
There are two different kinds of modules:



Configuration
=============

The command set is quite different between HC-05 (master,slave) and
HC-06 (slave-only).

Command Set for HC-06 (Slave only device)
-----------------------------------------

HC-06 goes into AT mode only when the module is not paired with any 
device. It doesn't need any explicit pull-down on any of the pins.

Here are the supported AT commands for HC-06.

+------------+--------------+----------------------------------+ 
| Command    |  Response    |  Comment                         |
+============+==============+==================================+ 
| AT         |    OK        |  Does nothing!                   |
+------------+--------------+----------------------------------+ 
| AT+VERSION | OKlinvorV1.5 |  The firmware version            |
+------------+--------------+----------------------------------+ 
| AT+NAMExyz | OKsetname    |  Sets the module name to "xyz"   |
+------------+--------------+----------------------------------+ 
| AT+PIN1234 | OKsetPIN     |  Sets the module PIN to 1234     |
+------------+--------------+----------------------------------+ 
| AT+BAUD1   | OK1200       |  Sets the baud rate to 1200      |
+------------+--------------+----------------------------------+ 
| AT+BAUD2   | OK2400       |  Sets the baud rate to 2400      |
+------------+--------------+----------------------------------+ 
| AT+BAUD3   | OK4800       |  Sets the baud rate to 4800      |
+------------+--------------+----------------------------------+ 
| AT+BAUD4   | OK9600       |  Sets the baud rate to 9600      |
+------------+--------------+----------------------------------+ 
| AT+BAUD5   | OK19200      |  Sets the baud rate to 19200     |
+------------+--------------+----------------------------------+ 
| AT+BAUD6   | OK38400      |  Sets the baud rate to 38400     |
+------------+--------------+----------------------------------+ 
| AT+BAUD7   | OK57600      |  Sets the baud rate to 57600     |
+------------+--------------+----------------------------------+ 
| AT+BAUD8   | OK115200     |  Sets the baud rate to 115200    |
+------------+--------------+----------------------------------+ 
| AT+BAUD9   | OK230400     |  Sets the baud rate to 230400    |
+------------+--------------+----------------------------------+ 
| AT+BAUDA   | OK460800     |  Sets the baud rate to 460800    |
+------------+--------------+----------------------------------+ 
| AT+BAUDB   | OK921600     |  Sets the baud rate to 921600    |
+------------+--------------+----------------------------------+ 
| AT+BAUDC   | OK1382400    |  Sets the baud rate to 1382400   |
+------------+--------------+----------------------------------+ 



Command Set for HC-05 (Slave and Master)
----------------------------------------



Good Resources
==============

* This link shows how o communicate against HC-06 module from a PC


.. _ref1: http://embeddedprogrammer.blogspot.com/2012/06/ubuntu-hacking-hc-06-bluetooth-module.html
