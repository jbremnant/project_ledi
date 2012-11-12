Working With Bluetooth Module
=============================

This document describes the bluetooth module included with LEDI.
There are two different kinds of modules: `HC-05` and `HC-06`.
Contrary to what the model number might suggest, the lower numbered
model, `HC-05` is the more "advanced" module. 

The model `HC-05` is both master and slave bluetooth device, whereas
`HC-06` is slave-only. Both modules have factory setting of
**9600 baudrate**. 


Configuration
=============

The command set is quite different between HC-05 (master,slave) and
HC-06 (slave-only).

Prerequisite
------------

I've tested this on Ubuntu. I used minicom before, but found this awesome
terminal program:

* Git project: https://github.com/JorgeAparicio/qSerialTerm/wiki
  - wiki: https://github.com/JorgeAparicio/qSerialTerm/wiki
* Relies on: http://qt-project.org/wiki/QtSerialPort

Quick list of commands I ran::

  # install the prerequisites
  sudo apt-get install libqt4-dev 
  sudo apt-get install libudev-dev
  sudo apt-get install libqwt-dev

  # install qtserial port
  cd $HOME/git
  git clone git://gitorious.org/qtplayground/qtserialport.git
  cd qtserialport
  qmake
  make
  sudo make install

  # now install qSerialTerm
  cd $HOME/git 
  git clone git://github.com/JorgeAparicio/qSerialTerm.git 
  cd qSerialTerm
  qmake 
  make 
  sudo make install



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
