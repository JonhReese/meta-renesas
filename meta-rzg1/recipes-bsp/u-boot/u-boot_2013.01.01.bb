require u-boot.inc

# This is needs to be validated among supported BSP's before we can
# make it default
DEFAULT_PREFERENCE = "-1"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

PV = "v2013.01.01+git${SRCREV}"

SRCREV = "5cb3e4172a7433bf67007138b7be67777f1a5087"
SRCREV_iwg23s = "fd830e5a2305365bd0bafb581662039fc23a87b7"

SRC_URI = "git://github.com/renesas-rz/renesas-u-boot-cip.git;branch=2013.01.01/rzg1-iwave;protocol=git \
"

SRC_URI_iwg23s = "git://github.com/renesas-rz/renesas-u-boot-cip.git;branch=2013.01.01/rzg1-iwave-g1c;protocol=git \
"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(iwg20m|iwg21m|iwg22m|iwg23s)"
