package com.cisco.oss.foundation.logging.structured.test;

public enum FoundationLoggingEventType {
    START, // process start
    STOP,  // process stop
    EX,    // exception
    T,     // transaction
    LT     // long transaction
}