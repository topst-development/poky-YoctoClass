SUMMARY = "OSCCA 4th week"
DESCRIPTION = "A small custom image for recipe practice."
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL:append = " \
    bash \
    iproute2 \
"
