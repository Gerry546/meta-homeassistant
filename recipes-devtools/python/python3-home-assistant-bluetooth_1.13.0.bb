SUMMARY = "Basic bluetooth models used by Home Assistant."
HOMEPAGE = "https://github.com/home-assistant-libs/home-assistant-bluetooth"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=732518afbb3ba92dbf606e49f9045cc9"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI = "git://github.com/home-assistant-libs/home-assistant-bluetooth.git;protocol=https;branch=main;"
SRCREV = "d4fd8a5fcad393c10f6c7472d93e996f0a0c31ba"

inherit python_poetry_core ptest

SRC_URI:append = " \
    file://run-ptest \
"
SRC_URI[sha256sum] = "9cac369fea11f67c1165df527f918a8c56630cbccb3c5cbe24b72f06aeb9f59b"

S = "${UNPACKDIR}/git"

RDEPENDS:${PN} = "\
    python3-core (>=3.11) \
    python3-habluetooth (>=3.0) \
"

RDEPENDS:${PN}-ptest = "\
    python3-pytest \
    python3-unittest-automake-output \
"

do_install_ptest() {
    install -d ${D}${PTEST_PATH}/tests
    cp -rf ${S}/tests/* ${D}${PTEST_PATH}/tests/
}
