SUMMARY = "Context manager to raise an exception when a future is done"
HOMEPAGE = "https://github.com/bdraco/async_interrupt"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da57f3e0372e39698a274746eb9d65d6"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "52b8cbf763d8328c79946b1c9b4c34108370e9022cf285ad0c6c53042dabc82f"

inherit pypi python_poetry_core

RDEPENDS:${PN} += "\
    python3-core (>=3.9) \
"

PYPI_PACKAGE = "async_interrupt"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
