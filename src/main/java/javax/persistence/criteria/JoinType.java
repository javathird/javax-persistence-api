/*
 * Copyright (c) 2008, 2009, 2011 Oracle, Inc. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.  The Eclipse Public License is available
 * at http://www.eclipse.org/legal/epl-v10.html and the Eclipse Distribution License
 * is available at http://www.eclipse.org/org/documents/edl-v10.php.
 */
package javax.persistence.criteria;

/**
 * Defines the three types of joins.
 * <p>
 * Right outer joins and right outer fetch joins are not required
 * to be supported in Java Persistence 2.0.  Applications that use
 * <code>RIGHT</code> join types will not be portable.
 *
 * @since Java Persistence 2.0
 */
public enum JoinType {
  /**
   * Inner join.
   */
  INNER,

  /**
   * Left outer join.
   */
  LEFT,

  /**
   * Right outer join.
   */
  RIGHT
}