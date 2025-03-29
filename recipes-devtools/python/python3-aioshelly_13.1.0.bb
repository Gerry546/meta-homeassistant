SUMMARY = "Python library to control Shelly"
HOMEPAGE = "https://github.com/home-assistant-libs/aioshelly"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dab31a1d28183826937f4b152143a33f"

inherit pypi python_setuptools_build_meta ptest

SRC_URI = "\
    file://run-ptest \
"
SRCREV = "1a02d6289df5c414d43ea04bb98214b3dcd71a20"
SRC_URI[sha256sum] = "fa242998c371bf361efdc66dc875196e618506848d0eece298167a6081458d8e"

PYPI_SRC_URI = "git://github.com/home-assistant-libs/aioshelly;branch=main;protocol=https"

S = "${UNPACKDIR}/git"

RDEPENDS:${PN} = "\
    python3-aiohttp (>=3.11.1) \
    python3-bluetooth-data-tools (>=1.19.0) \
    python3-core (>=3.11) \
    python3-habluetooth (>=3.22.0) \
    python3-orjson (>=3.8.1) \
"

RDEPENDS:${PN}-ptest = "\
    python3-pytest \
    python3-pytest-asyncio \
    python3-unittest-automake-output \
"

do_install_ptest() {
    install -d ${D}${PTEST_PATH}/tests
    cp -rf ${S}/tests/rpc_device/* ${D}${PTEST_PATH}/tests/
}
