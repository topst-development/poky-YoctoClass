# Week 4 - Custom Yocto Image

## Summary

I created a custom Yocto image named leejh-image.

This image is based on core-image-minimal and adds extra packages for testing.

## What I did

- Added custom layer: meta-leejh
- Created custom image recipe: leejh-image.bb
- Built the image with bitbake
- Booted the image on QEMU
- Checked added packages inside the running image

## Image base

leejh-image uses core-image-minimal as its base image.

The recipe includes this line:

require recipes-core/images/core-image-minimal.bb

## Verified packages

The following packages were checked inside QEMU:

- vim
- nano
- htop

