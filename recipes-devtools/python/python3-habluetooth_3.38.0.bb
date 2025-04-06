SUMMARY = "High availability Bluetooth"
HOMEPAGE = "https://github.com/bluetooth-devices/habluetooth"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da57f3e0372e39698a274746eb9d65d6"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI = "git://github.com/Bluetooth-Devices/habluetooth.git;protocol=https;branch=main \
           file://run-ptest \
           file://0001-fix-setuptools-and-license.patch \
           "
SRC_URI[sha256sum] = "89dc8c4e9d79a25c2666dafde0f49241144ac29e69d9d9f5bbf1122733c7f42c"
SRCREV = "bf7b465ac5e317f5b66e225cead55414a20f2ed7"

inherit python_poetry_core ptest cython

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "\
    python3-core (>=3.11) \
    python3-bleak (>=0.21.1) \
    python3-bleak-retry-connector (>=3.3.0) \
    python3-bluetooth-data-tools (>=1.16.0) \
    python3-bluetooth-adapters (>=0.16.1) \
    python3-bluetooth-auto-recovery (>=1.2.3) \
    python3-async-interrupt (>=1.1.1) \
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
