SUMMARY = "Mock out requests made by ClientSession from aiohttp package"
HOMEPAGE = "https://github.com/pnuckowski/aioresponses"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b22b40d5974300051216633098387c57"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI += "file://0001-Make-project-PEP-517-compliant.patch"
SRC_URI[sha256sum] = "b861cdfe5dc58f3b8afac7b0a6973d5d7b2cb608dd0f6253d16b8ee8eaf6df11"

DEPENDS += "\
    python3-pbr-native \
"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "python3-aiohttp"

PYPI_PACKAGE = "aioresponses"
