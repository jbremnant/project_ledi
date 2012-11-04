#!/bin/bash

# config is stored: ~/.config/rst2wp/wordpressrc


if [ $# -lt 1 ]; then
  echo "usage: $0 <rstfile> [upload]"
  # $RSTCMD --help 
  exit 1
fi

RSTFILE=$1
shift;
DOWP=0
if [ "${1}X" != "X" ]; then
  DOWP=1
fi

if [ $DOWP -eq 1 ]; then
  RSTCMD=/home/jbkim/git/rst2wp/rst2wp.py
  echo $RSTCMD $RSTFILE
  $RSTCMD $RSTFILE $*
else
  HTMLOUT=/var/www/droparea/test.html
  # /usr/local/lib/python2.6/dist-packages/docutils/writers/html4css1/html4css1.css
  rst2html.py --syntax-highlight=short --stylesheet=/usr/local/lib/python2.6/dist-packages/docutils/writers/html4css1/html4css1.css,mystyle.css $* $RSTFILE $HTMLOUT
  echo "written to $HTMLOUT"
fi
