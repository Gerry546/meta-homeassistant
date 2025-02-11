SUMMARY = "An async resolver for aiohttp that supports MDNS"
HOMEPAGE = "https://github.com/aio-libs/aiohttp-asyncmdnsresolver"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI[sha256sum] = "41cf8cb159cef540cf0f8a008b2a7a2f031e0193c90cfafd0a32f58133f6b15c"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "\
    python3-aiodns (>=3.2.0) \
    python3-aiohttp (>=3.10.0) \
    python3-zeroconf (>=0.142.0) \
"

PYPI_PACKAGE = "aiohttp_asyncmdnsresolver"
