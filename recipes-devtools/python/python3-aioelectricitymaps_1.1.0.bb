SUMMARY = "Async Python 3 wrapper for Electricity maps"
HOMEPAGE = "https://github.com/jpbede/aioelectricitymaps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9647659b324628f18a7bc41e3f7bfbf7"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "489de78c4c4bd7413a8db8989f5fd9113f3e9527b6a2d592492df7fe4a2786c4"

inherit pypi python_poetry_core

PYPI_PACKAGE = "aioelectricitymaps"
RDEPENDS:${PN} = "\
    python3-aiohttp (>=3.8.0) \
    python3-mashumaro (>=3.11) \
    python3-orjson (>=3.9.8) \
"
