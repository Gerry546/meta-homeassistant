SUMMARY = "Tools to enumerate and find Bluetooth Adapters"
HOMEPAGE = "https://github.com/bluetooth-devices/bluetooth-adapters"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=732518afbb3ba92dbf606e49f9045cc9"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI = "\
    git://github.com/Bluetooth-Devices/bluetooth-adapters.git;protocol=https;branch=main \
    file://run-ptest \
"
SRC_URI[sha256sum] = "d2ff76ca3ee7aa27df18e0c233e36e16251bd92225d0c1d5712f07360f607176"
SRCREV = "c1718bea0ce253d12ffe0422406c22be009da435"

inherit python_poetry_core ptest

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "\
    python3-aiooui (>=0.1.1) \
    python3-bleak (>=0.21.1) \
    python3-core (>3.9) \
    python3-uart-devices (>=0.1.0) \
"

RDEPENDS:${PN}-dev = "\
    python3-dbus-fast (>=1.21.0) \
    python3-usb-devices (>=0.4.5) \
"

RDEPENDS:${PN}-ptest = "\
    python3-pytest \
    python3-pytest-asyncio \
    python3-unittest-automake-output \
"

do_install_ptest() {
    install -d ${D}${PTEST_PATH}/tests
    cp -rf ${S}/tests/* ${D}${PTEST_PATH}/tests/
}