package com.LibraryManagementSystem.LibraryManagementSystem.Exception;

public class ResourceNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2873090046297564786L;

	public ResourceNotFoundException(String message) {
        super(message);
    }
}
