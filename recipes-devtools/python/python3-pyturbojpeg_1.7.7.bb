SUMMARY = "A Python wrapper of libjpeg-turbo for decoding and encoding JPEG image."
HOMEPAGE = "https://github.com/lilohuang/PyTurboJPEG"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5df3bb9cdf8813c063c798998565c764"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "2f1929f6bb32faf3c6007fbfbae1932e125b690173be60bcae03f678ffa4963b"

inherit pypi setuptools3

PYPI_PACKAGE = "PyTurboJPEG"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"

RDEPENDS:${PN} += "\
    libturbojpeg \
    python3-numpy \
"
