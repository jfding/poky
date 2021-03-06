SUMMARY = "GNU multiprecision arithmetic library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, rational numbers, and floating point numbers"
HOMEPAGE = "http://gmplib.org/"
BUGTRACKER = "http://gmplib.org/mailman/listinfo/gmp-bugs"
# demo is licensed under GPLv2+, which however we don't package at all
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=892f569a555ba9c07a568a7c0c4fa63a \
                    file://COPYING.LIB;md5=fbc093901857fcd118f065f900982c24 \
                    file://gmp-h.in;beginline=6;endline=21;md5=e056f74a12c3277d730dbcfb85d2ca34"
PR = "r2"

SRC_URI = "${GNU_MIRROR}/gmp/${BP}.tar.bz2 \
           file://disable-stdc.patch \
           file://gmp_fix_for_automake-1.12.patch \
           "

SRC_URI[md5sum] = "091c56e0e1cca6b09b17b69d47ef18e3"
SRC_URI[sha256sum] = "d07ffcb37eecec35c5ec72516d10b35fdf6e6fef1fcf1dcd37e30b8cbf8bf941"

PACKAGECONFIG ??= ""
PACKAGECONFIG[readline] = "--with-readline=yes,--with-readline=no,readline"

inherit autotools texinfo
