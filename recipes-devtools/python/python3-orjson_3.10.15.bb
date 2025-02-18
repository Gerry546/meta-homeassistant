SUMMARY = "Fast, correct Python JSON library supporting dataclasses, datetimes, and numpy"
HOMEPAGE = "https://pypi.org/project/orjson/"
LICENSE = "Apache-2.0 | MIT"
LIC_FILES_CHKSUM = "file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

# require ${BPN}-crates.inc

PYPI_PACKAGE = "orjson"

SRC_URI[sha256sum] = "05ca7fe452a2e9d8d9d706a2984c95b9c2ebc5db417ce0b7a49b91d50642a23e"
SRC_URI:append = " \
    file://0001-Fix-compilation-error-for-orjson.patch \
"

inherit pypi python_maturin
