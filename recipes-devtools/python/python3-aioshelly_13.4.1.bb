SUMMARY = "Python library to control Shelly"
HOMEPAGE = "https://github.com/home-assistant-libs/aioshelly"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dab31a1d28183826937f4b152143a33f"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

inherit pypi python_setuptools_build_meta ptest-python-pytest

SRC_URI[sha256sum] = "292ddd8a51f4ae8eaa66ffc949e2988d0fae8445921845449addd0347308a54e"

RDEPENDS:${PN} = "\
    python3-aiohttp (>=3.11.1) \
    python3-bluetooth-data-tools (>=1.19.0) \
    python3-core (>=3.11) \
    python3-habluetooth (>=3.22.0) \
    python3-orjson (>=3.8.1) \
"

RDEPENDS:${PN}-ptest += "\
    python3-pytest-asyncio \
    python3-aioresponses \
"
