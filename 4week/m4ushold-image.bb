DESCRIPTION = "A custom image based on core-image-minimal with vim, nano, and htop."
LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "\
	vim \
	nano \
	htop \
"
