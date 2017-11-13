package com.techm.adms.dt.common.exception;

/**
 * This is the exception class to be used in case of any errors caused during
 * the integration of third party API presentation or business DT integration
 * layer
 * 
 * <p>
 * It extends {@link DTRuntimeException} the base Exception class for DT
 * application.
 * 
 * @CreatedBy TechM
 * @CreatedOn 07-Oct-2015 10:43:01 am
 */
@SuppressWarnings("serial")
public class DTIntegrationException extends DTRuntimeException {

    /**
     * Instantiates a new DT Integration exception.
     * 
     * @param message
     *            the message
     * @param exception
     *            {@link Throwable} cause
     * @see RuntimeException#RuntimeException(String, Throwable)
     */
    public DTIntegrationException(final String message, final Throwable exception) {
        super(message, exception);
    }

    /**
     * Instantiates a new DT Integration exception.
     * 
     * @param message
     *            the message
     * @see RuntimeException#RuntimeException(String)
     */
    public DTIntegrationException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new DT Integration exception.
     * 
     * @param exception
     *            {@link Throwable} cause
     * @see RuntimeException#RuntimeException(Throwable)
     */
    public DTIntegrationException(final Throwable exception) {
        super(exception);
    }

}
