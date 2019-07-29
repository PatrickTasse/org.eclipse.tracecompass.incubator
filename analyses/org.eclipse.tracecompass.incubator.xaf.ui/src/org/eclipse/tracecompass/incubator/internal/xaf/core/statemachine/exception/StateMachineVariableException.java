/*******************************************************************************
 * Copyright (c) 2016 École Polytechnique de Montréal
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.eclipse.tracecompass.incubator.internal.xaf.core.statemachine.exception;

/**
 * @author Raphaël Beamonte
 *
 */
public class StateMachineVariableException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new exception with null as its detail message.
     *
     */
    public StateMachineVariableException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param message
     *            The message
     */
    public StateMachineVariableException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     *
     * @param message
     *            The message
     * @param cause
     *            The cause
     */
    public StateMachineVariableException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new exception with the specified detail message, cause,
     * suppression enabled or disabled, and writable stack trace enabled or
     * disabled.
     *
     * @param message
     *            The message
     * @param cause
     *            The cause
     * @param enableSuppression
     *            Whether or not to enable suppression
     * @param writableStackTrace
     *            Whether or not to set the stack trace as writeable
     */
    public StateMachineVariableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Constructs a new exception with the specified cause and a detail message
     * of (cause==null ? null : cause.toString()) (which typically contains the
     * class and detail message of cause).
     *
     * @param cause
     *            The cause
     */
    public StateMachineVariableException(Throwable cause) {
        super(cause);
    }

}