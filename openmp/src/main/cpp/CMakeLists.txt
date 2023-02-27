cmake_minimum_required(VERSION 3.22.1)

project(mpdemo)

include_directories(${CMAKE_SOURCE_DIR}/util)

add_library(
        ${PROJECT_NAME}
        SHARED
        mpdemo.cpp)

target_link_libraries(
        ${PROJECT_NAME}

        # Step.1
        -static-openmp
        -fopenmp

        log)
