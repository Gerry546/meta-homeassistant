SUMMARY = "Library implementing a Zigbee stack"
HOMEPAGE = "https://github.com/zigpy/zigpy"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

DEPENDS += "\
    python3-setuptools-git-versioning-native \
"

SRC_URI += "file://0001-Allow-setuptools-git-versioning-3.patch"
SRC_URI[sha256sum] = "86138053f445846ec39d3f9e314d65f4d087c8b7d8c893c2d7e50ead8f12fc57"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "zigpy"

RDEPENDS:${PN} = "\
    python3-attrs \
    python3-aiohttp \
    python3-aiosqlite (>=0.20.0) \
    python3-crccheck \
    python3-cryptography \
    python3-voluptuous \
    python3-jsonschema \
    python3-pyserial-asyncio \
    python3-typing-extensions \
    python3-frozendict \
"
