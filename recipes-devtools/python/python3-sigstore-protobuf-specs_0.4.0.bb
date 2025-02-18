SUMMARY = "A library for serializing and deserializing Sigstore messages"
HOMEPAGE = "https://github.com/sigstore/protobuf-specs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "5eb5a2cf6c40bc60eb4703ea31c0df9b410a92153bd22dde5a3f1b4f66ef0a90"

inherit pypi python_flit_core

PYPI_PACKAGE = "sigstore_protobuf_specs"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"

RDEPENDS:${PN} = "\
    python3-betterproto (=2.0.0b6) \
"
