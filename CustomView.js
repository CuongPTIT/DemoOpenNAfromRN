import {requireNativeComponent, ViewPropTypes} from 'react-native';
import React, {Component} from 'react';
const GameView = requireNativeComponent('GameViewManager', GameViewClass);
export default class GameViewClass extends Component {
  render() {
    return <GameView {...this.props} />;
  }
}
