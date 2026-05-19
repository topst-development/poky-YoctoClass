# Week4 Assignment 강민희

## 환경

- Vultr Cloud Instance
- vCPU/s: 16 vCPUs
- RAM: 65536.00 MB
- Storage: 1280 GB SSD
- OS: Ubuntu 24.04 LTS x64
- poky-5.0.17 core-image-minimal에 대한 downloads/ sstate-cache/ 캐시 사용
  - 14G downloads/
  - 8.9G sstate-cache/

## Create Own Layer && **Add packages**

```
Create meta-kmh and add it to the project.
```

- `build$ bitbake-layers create-layer ../meta-kmh`
- `build$ bitbake-layers add-layer ../meta-kmh`
  - `build$ bitbake-layers show-layers`로 확인
- `build$ mkdir -p ../meta-kmh/recipes-core/images`
- `build$ vim ../meta-kmh/recipes-core/images/my-image.bb`
  - `build$ bitbake-layers show-recipes`로 확인

```
DESCRIPTION = "My custom image"

LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL:append = " vim nano htop"
```

## Build Options

- conf/local.conf

```
BB_NUMBER_THREADS = "16"
PARALLEL_MAKE = "-j16"
```

## 1st Build (vim)

`build$ bitbake my-image` bitbake my-image

```
Parsing of 922 .bb files complete (0 cached, 922 parsed). 1880 targets, 47 skipped, 0 masked, 0 errors.
NOTE: Resolving any missing task queue dependencies
ERROR: Nothing RPROVIDES 'nano' (but /home/kangmini/poky/meta-kmh/recipes-core/images/my-image.bb RDEPENDS on or otherwise requires it)
NOTE: Runtime target 'nano' is unbuildable, removing...
Missing or unbuildable dependency chain was: ['nano']
ERROR: Required build target 'my-image' has no buildable providers.
Missing or unbuildable dependency chain was: ['my-image', 'nano']

Summary: There were 2 ERROR messages, returning a non-zero exit code.
```

- nano, htop에 대한 의존성 오류 
- 일단 vim만 추가하여 build 함
- 결과: `build_stats-vim`



- 2시간 17분 40초 소요 

## 2nd Build (vim, nano, htop)

- layer 추가
- `build$ bitbake-layers add-layer /home/kangmini/meta-openembedded/meta-oe/` 
- `build$ bitbake my-image` 
- 결과: `build_stats` 



- 3분 22초 소요

