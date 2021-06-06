/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9;

/**
 *
 * @author tanbo
 */
public class SecurityManagerTest extends SecurityManager{
    
    public void checkPackageAcces(String pkg) {
        
        throw new SecurityException();
        
        grant{
      permission java.lang.RuntimePermission "setSecurityManager";  
      permission java.lang.RuntimePermission "createSecurityManager";  
      permission java.lang.RuntimePermission "  usePolicy";
        };
        
    }
    
}
