cmake_minimum_required(VERSION 3.22.1)

project("vectorized")

include_directories(${CMAKE_SOURCE_DIR}/util)

add_library(
        ${PROJECT_NAME}
        SHARED
        vectorized.cpp
)

target_link_libraries(
        ${PROJECT_NAME}
        log
)
