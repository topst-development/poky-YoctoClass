SUMMARY = "My Custom Company Image"
IMAGE_INSTALL = "packagegroup-core-boot"
LICENSE = "MIT"

inherit core-image

# vim, nano, htop 패키지 추가
#IMAGE_INSTALL:append = " vim nano htop"
