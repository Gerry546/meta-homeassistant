SUMMARY = "Async UPnP Client for Python"
HOMEPAGE = "https://github.com/StevenLooman/async_upnp_client"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=f4eda51018051de136d3b3742e9a7a40"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

inherit pypi setuptools3

PYPI_PACKAGE = "async_upnp_client"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"

S = "${WORKDIR}/async_upnp_client-${PV}"

SRC_URI[sha256sum] = "42994c265fa335c0ddc43be48fc80d3171dfed4258534277546b7b45137ef6a0"

RDEPENDS:${PN} = "\
	python3-core (>=3.8) \
	python3-async-timeout (>=3.0.0) \
	python3-aiohttp (>=3.9.1) \
	python3-python-didl-lite (=1.4.0) \
	python3-defusedxml (>=0.6.0) \
	python3-voluptuous (>=0.15.2) \
"
