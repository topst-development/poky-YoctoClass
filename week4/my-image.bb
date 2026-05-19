#######################################################
# core-image-minimal에 vim, htop, nano를 추가하여 image build
#
# bitbake-layers add-layer ~/meta-openembedded/meta-oe/
#
#######################################################

DESCRIPTION = "My custom image"

LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL:append = " vim htop nano"