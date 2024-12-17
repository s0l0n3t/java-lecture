package com.furkantokgoz.cdi;


import jakarta.enterprise.context.*;
import jakarta.inject.Named;

import java.io.Serializable;

@Named(value = "scopedClass")
//@ApplicationScoped
//@SessionScoped
//@Dependent
//@ConversationScoped
//@RequestScoped

public class ScopedClass implements Serializable {
}
