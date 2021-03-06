/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

/**
 * $Id: $
 */

package com.linkedin.r2.transport.http.client;

/**
 * @author Ang Xu
 * @version $Revision: $
 */
public interface PoolStats
{
  /**
   * Get the total number of pool objects created between
   * the starting of the Pool and the call to getStats().
   * Does not include create errors.
   * @return The total number of pool objects created
   */
  int getTotalCreated();

  /**
   * Get the total number of pool objects destroyed between
   * the starting of the Pool and the call to getStats().
   * Includes lifecycle validation failures, disposes,
   * and timed-out objects, but does not include destroy errors.
   * @return The total number of pool objects destroyed
   */
  int getTotalDestroyed();

  /**
   * Get the total number of lifecycle create errors between
   * the starting of the Pool and the call to getStats().
   * @return The total number of create errors
   */
  int getTotalCreateErrors();

  /**
   * Get the total number of lifecycle destroy errors between
   * the starting of the Pool and the call to getStats().
   * @return The total number of destroy errors
   */
  int getTotalDestroyErrors();

  /**
   * Get the total number of pool objects destroyed (or failed to
   * to destroy because of an error) because of disposes or failed
   * lifecycle validations between the starting of the Pool
   * and the call to getStats().
   * @return The total number of destroyed "bad" objects
   */
  int getTotalBadDestroyed();

  /**
   * Get the total number of timed out pool objects between the
   * starting of the Pool and the call to getStats().
   * @return The total number of timed out objects
   */
  int getTotalTimedOut();

  /**
   * Get the number of pool objects checked out at the time of
   * the call to getStats().
   * @return The number of checked out pool objects
   */
  int getCheckedOut();

  /**
   * Get the configured maximum pool size.
   * @return The maximum pool size
   */
  int getMaxPoolSize();

  /**
   * Get the pool size at the time of the call to getStats().
   * @return The pool size
   */
  int getPoolSize();

  /**
   * Get the maximum number of checked out objects. Reset
   * after each call to getStats().
   * @return The maximum number of checked out objects
   */
  int getSampleMaxCheckedOut();

  /**
   * Get the maximum pool size. Reset after each call to
   * getStats().
   * @return The maximum pool size
   */
  int getSampleMaxPoolSize();

  /**
   * Return a string which represents the pool stats
   */
  String toString();
}
