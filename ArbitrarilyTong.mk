# ArbitrarilyTong Apps
PRODUCT_PACKAGES += ArbitrarilyTongSettings

# Add Prebuilt Apps
$(call inherit-product, ArbitrarilyTong/Apps/PrebuiltApps.mk)

# Add Audio
$(call inherit-product, ArbitrarilyTong/Audios/audio.mk)

# Add Fonts
$(call inherit-product, ArbitrarilyTong/Fonts/font.mk)

# Add APNs
# $(call inherit-product, ArbitrarilyTong/APNs/APN.mk)

# Add GAPPS
$(call inherit-product-if-exists, vendor/gapps/common.mk)