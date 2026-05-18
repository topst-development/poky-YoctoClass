SUMMARY = "leejh custom image"
DESCRIPTION = "A custom image based on core-image-minimal with vim, nano, and htop."
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL:append = " vim nano htop"
