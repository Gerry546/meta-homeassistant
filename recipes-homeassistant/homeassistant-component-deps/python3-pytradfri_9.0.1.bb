SUMMARY = "IKEA Trådfri/Tradfri API. Control and observe your lights from Python. Examples available. On pypi. Sans-io."
HOMEPAGE = "https://github.com/home-assistant-libs/pytradfri"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37ea2250f00b424609d55b35f829c514"

SRC_URI[sha256sum] = "f57e0211cb27e86429e894cdfe6206a9b044908ef99859f4ab99334cfb54579c"

inherit pypi setuptools3

PYPI_PACKAGE = "pytradfri"

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-aiocoap \
"
