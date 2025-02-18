SUMMARY = "Thread-safe asyncio-aware queue for Python"
HOMEPAGE = "https://github.com/aio-libs/janus"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23878c357ebb4c8ce1109be365043349"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "0970f38e0e725400496c834a368a67ee551dc3b5ad0a257e132f5b46f2e77770"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
    python3-typing-extensions (>=3.7.4.3) \
"
