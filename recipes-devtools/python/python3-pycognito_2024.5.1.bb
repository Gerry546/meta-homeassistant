DESCRIPTION = "Python library for using AWS Cognito. With support for SRP."
HOMEPAGE = "https://github.com/pvizeli/pycognito"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

inherit pypi setuptools3

SRC_URI[sha256sum] = "e211c66698c2c3dc8680e95107c2b4a922f504c3f7c179c27b8ee1ab0fc23ae4"

RDEPENDS:${PN} = "\
	python3-boto3 (>=1.10.49) \
	python3-requests (>=2.22.0) \
	python3-envs (>=1.3) \
	python3-pyjwt (>=2.8.0) \
"
