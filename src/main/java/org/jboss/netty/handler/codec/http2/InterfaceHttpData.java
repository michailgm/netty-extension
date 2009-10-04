/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * by the @author tags. See the COPYRIGHT.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.netty.handler.codec.http2;

/**
 * Interface for all Objects that could be encoded/decoded using HttpPostRequestEncoder/Decoder
 * @author frederic bregier
 *
 */
public interface InterfaceHttpData extends Comparable<InterfaceHttpData> {
    public static enum HttpDataType {
        Attribute, FileUpload, InternalAttribute;
    }

    /**
     * Returns the name of this InterfaceHttpData.
     */
    String getName();

    /**
     *
     * @return The HttpDataType
     */
    HttpDataType getHttpDataType();
}
